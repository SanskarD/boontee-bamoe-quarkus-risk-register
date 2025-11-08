## Quick orientation — Risk Register (RR)

This repository is a Quarkus + jBPM/Kogito process application (BAMOE canvas generator). It includes backend Java processes and frontend custom forms (React / PatternFly) used by the Kogito console.

Keep these facts in mind when editing code or making changes:

- Build system: Maven. Primary commands:
  - Dev (fast feedback, hot-reload): `mvn clean quarkus:dev`
  - Package JAR: `mvn clean package` (produces `target/quarkus-app/quarkus-run.jar`)
  - Uber-jar: `mvn clean package -Dquarkus.package.type=uber-jar`
  - Native image (container build option): `mvn clean package -Dnative -Dquarkus.native.container-build=true`
  - Activate Maven profiles with `-Pdevelopment` or `-Pcontainer` when you need Data Index, persistence, or management-console features.

- Project layout to reference:
  - `pom.xml` — Quarkus + Kogito/jBPM dependencies and profiles (important: `development` and `container` profiles add persistence/data-index/console features).
  - `src/main/resources/RR.bpmn` — BPMN process definition used by the app.
  - `src/main/resources/custom-forms-dev/` — React/TSX forms that the Kogito console embeds (examples: `RiskRegisterProcess_MakerSubmitRR.tsx`, `RiskRegisterProcess_DivHeadVerifyRR.tsx`).
  - `src/main/java/riskregister/model/` — POJOs used by processes (Approval, RiskRegister, etc.).
  - `src/main/resources/application.properties` — runtime config; contains `<TODO>` placeholders that must be filled for some features (DB, OIDC).
  - `target/generated-sources/kogito/` and `target/classes/META-INF/jsonSchema/` — generated process adapters and JSON schemas (useful for debugging runtime contracts).

## Architecture and data flow (short)

- Processes (BPMN) live in `src/main/resources`. Kogito generates Java process wrappers under `target/generated-sources/kogito` during build. The frontend forms are static resources bound to processes by name.
- Custom forms are React components under `src/main/resources/custom-forms-dev/`. They are built/served by the web console embedding the form. Forms use a global `window.Form.openForm(...)` API to receive initial data and expose lifecycle hooks (see `getFormData`, `setFormData`, `formApi.beforeSubmit`, `formApi.afterSubmit`). Example: `Form__RiskRegisterProcess_MakerSubmitRR.tsx` implements `setFormData` and `getFormData` to map flat React state to the nested process payload.
- Backend persistence, Data Index, and Management Console are controlled by Maven profiles. If you need DB-backed runs or the console UI, start with `mvn -Pdevelopment quarkus:dev` or `mvn -Pcontainer package` depending on what you need.

## Project-specific patterns & conventions

- Generated form state variables use a delimiter-based naming style: e.g. `riskRegister__primaryRiskInfo__department` with setter `set__riskRegister__primaryRiskInfo__department`. `getFormData` builds the nested JSON shape expected by the process. Follow this pattern when adding fields to a form.
- Forms rely on PatternFly components (DatePicker, TimePicker, Tabs, FormGroup). Date/time handling uses local helpers `parseDate` and `parseTime` inside the TSX files — preserving the helpers when changing date fields is important to avoid formatting regressions.
- Do not rename process or form files lightly: the Kogito console binds forms to process/task names. Example filenames: `RiskRegisterProcess_MakerSubmitRR.tsx` corresponds to a maker submit task in the `RR.bpmn` process.
- Resources are filtered at build time (`pom.xml` sets resource filtering for `src/main/resources`). Keep resource paths stable (images referenced under `/resources/images/`) so they resolve correctly in the built artifact.

## Debugging and developer workflow notes

- When editing forms, run `mvn clean quarkus:dev` for fast feedback; the dev mode supports live reloading of backend Java and some static resources. For frontend TSX edits, the console that embeds the form may need restart depending on how the console serves static content.
- To enable remote debugging attach: `mvn clean quarkus:dev -Ddebug` (Quarkus opens JDWP on 5005 by default).
- If you need the Kogito Data Index or persistence features (search, management console), start with `mvn -Pdevelopment quarkus:dev` or `mvn -Pcontainer package` depending on deployment target.

## Tests & validation

- The project includes Quarkus JUnit5 and RestAssured dependencies in `pom.xml`. Run tests with `mvn test`. To run a single test class use `mvn -Dtest=YourTest test`.
- Generated JSON schemas live in `target/classes/META-INF/jsonSchema/` — useful to validate the shape that frontend forms must produce.

## Where to look for specific tasks (examples)

- Add a new form field: edit matching TSX under `src/main/resources/custom-forms-dev/`, add corresponding state variable and update `getFormData`/`setFormData` mapping.
- Add a process variable/POJO: update `src/main/java/riskregister/model/` and the BPMN in `src/main/resources/RR.bpmn`; then `mvn package` to regenerate Kogito artifacts.
- Enable persistence/Data Index: review `pom.xml` profiles `development` and `container` and start with `-Pdevelopment` for local iteration.

## Small checklist for PRs from AI changes

1. Ensure `getFormData` and `setFormData` remain consistent with the nested POJO shape in `src/main/java/riskregister/model/`.
2. Preserve `parseDate`/`parseTime` helpers when changing date/time inputs.
3. Run `mvn -Pdevelopment quarkus:dev` and exercise the form in the Kogito console to verify the embedded API (`window.Form`) binding.

If anything above is ambiguous or you'd like me to include additional examples (e.g. mapping snippets from `RiskRegisterProcess_MakerSubmitRR.tsx`), tell me which area to expand.
