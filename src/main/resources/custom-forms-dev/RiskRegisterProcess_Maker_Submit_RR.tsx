import React, { useCallback, useEffect, useState } from 'react';
import {
	Card,
	CardBody,
	TextInput,
	FormGroup,
	DatePicker,
	Split,
	SplitItem,
	Button,
} from '@patternfly/react-core';
import { PlusCircleIcon, MinusCircleIcon } from '@patternfly/react-icons';
const Form__RiskRegisterProcess_Maker_Submit_RR: React.FC<any> = (
	props: any
) => {
	const [formApi, setFormApi] = useState<any>();
	const [
		riskRegister__primaryRiskInfo__department,
		set__riskRegister__primaryRiskInfo__department,
	] = useState<string>('');
	const [
		riskRegister__primaryRiskInfo__division,
		set__riskRegister__primaryRiskInfo__division,
	] = useState<string>('');
	const [
		riskRegister__primaryRiskInfo__financialYear,
		set__riskRegister__primaryRiskInfo__financialYear,
	] = useState<string>();
	const [
		riskRegister__primaryRiskInfo__objectiveOfProcess,
		set__riskRegister__primaryRiskInfo__objectiveOfProcess,
	] = useState<string>('');
	const [
		riskRegister__primaryRiskInfo__processName,
		set__riskRegister__primaryRiskInfo__processName,
	] = useState<string>('');
	const [
		riskRegister__primaryRiskInfo__processType,
		set__riskRegister__primaryRiskInfo__processType,
	] = useState<string>('');
	const [
		riskRegister__primaryRiskInfo__riskDescriptionPerceivedInherentRisk,
		set__riskRegister__primaryRiskInfo__riskDescriptionPerceivedInherentRisk,
	] = useState<string>('');
	const [
		riskRegister__primaryRiskInfo__riskReportedBy,
		set__riskRegister__primaryRiskInfo__riskReportedBy,
	] = useState<string>('');
	const [riskRegister__reason__comments, set__riskRegister__reason__comments] =
		useState<string>('');
	const [riskRegister__reason__reasons, set__riskRegister__reason__reasons] =
		useState<string>('');
	const [
		riskRegister__residualRisk__financialRisk,
		set__riskRegister__residualRisk__financialRisk,
	] = useState<string>('');
	const [
		riskRegister__residualRisk__likelihoodScale,
		set__riskRegister__residualRisk__likelihoodScale,
	] = useState<string>('');
	const [
		riskRegister__residualRisk__reputationalRiskImpact,
		set__riskRegister__residualRisk__reputationalRiskImpact,
	] = useState<string>('');
	const [
		riskRegister__riskCategory__businessDisruptionRisk,
		set__riskRegister__riskCategory__businessDisruptionRisk,
	] = useState<string>('');
	const [
		riskRegister__riskCategory__cause,
		set__riskRegister__riskCategory__cause,
	] = useState<string>('');
	const [
		riskRegister__riskCategory__causeSubClassification,
		set__riskRegister__riskCategory__causeSubClassification,
	] = useState<string>('');
	const [
		riskRegister__riskCategory__financialRiskImpact,
		set__riskRegister__riskCategory__financialRiskImpact,
	] = useState<string>('');
	const [
		riskRegister__riskCategory__likelihoodScale,
		set__riskRegister__riskCategory__likelihoodScale,
	] = useState<string>('');
	const [
		riskRegister__riskCategory__reputationRiskImpact,
		set__riskRegister__riskCategory__reputationRiskImpact,
	] = useState<string>('');
	const [
		riskRegister__riskCategory__type,
		set__riskRegister__riskCategory__type,
	] = useState<string[]>([]);
	const [
		riskRegister__riskControlMeasure__controlDescription,
		set__riskRegister__riskControlMeasure__controlDescription,
	] = useState<string>('');
	const [
		riskRegister__riskControlMeasure__controlDocumentationAndDisseminationRiskImpact,
		set__riskRegister__riskControlMeasure__controlDocumentationAndDisseminationRiskImpact,
	] = useState<string>('');
	const [
		riskRegister__riskControlMeasure__controlExecutionRiskImpact,
		set__riskRegister__riskControlMeasure__controlExecutionRiskImpact,
	] = useState<string>('');
	const [
		riskRegister__riskControlMeasure__levelsOfControlExecutionRiskImpact,
		set__riskRegister__riskControlMeasure__levelsOfControlExecutionRiskImpact,
	] = useState<string>('');
	const [
		riskRegister__riskControlMeasure__monitoringPeriodicityRiskImpact,
		set__riskRegister__riskControlMeasure__monitoringPeriodicityRiskImpact,
	] = useState<string>('');
	const [
		riskRegister__riskControlMeasure__natureOfControlsRiskImpact,
		set__riskRegister__riskControlMeasure__natureOfControlsRiskImpact,
	] = useState<string>('');
	/* Utility function that fills the form with the data received from the kogito runtime */
	const setFormData = (data) => {
		if (!data) {
			return;
		}
		set__riskRegister__primaryRiskInfo__department(
			data?.riskRegister?.primaryRiskInfo?.department ?? ''
		);
		set__riskRegister__primaryRiskInfo__division(
			data?.riskRegister?.primaryRiskInfo?.division ?? ''
		);
		set__riskRegister__primaryRiskInfo__financialYear(
			data?.riskRegister?.primaryRiskInfo?.financialYear
		);
		set__riskRegister__primaryRiskInfo__objectiveOfProcess(
			data?.riskRegister?.primaryRiskInfo?.objectiveOfProcess ?? ''
		);
		set__riskRegister__primaryRiskInfo__processName(
			data?.riskRegister?.primaryRiskInfo?.processName ?? ''
		);
		set__riskRegister__primaryRiskInfo__processType(
			data?.riskRegister?.primaryRiskInfo?.processType ?? ''
		);
		set__riskRegister__primaryRiskInfo__riskDescriptionPerceivedInherentRisk(
			data?.riskRegister?.primaryRiskInfo
				?.riskDescriptionPerceivedInherentRisk ?? ''
		);
		set__riskRegister__primaryRiskInfo__riskReportedBy(
			data?.riskRegister?.primaryRiskInfo?.riskReportedBy ?? ''
		);
		set__riskRegister__reason__comments(
			data?.riskRegister?.reason?.comments ?? ''
		);
		set__riskRegister__reason__reasons(
			data?.riskRegister?.reason?.reasons ?? ''
		);
		set__riskRegister__residualRisk__financialRisk(
			data?.riskRegister?.residualRisk?.financialRisk ?? ''
		);
		set__riskRegister__residualRisk__likelihoodScale(
			data?.riskRegister?.residualRisk?.likelihoodScale ?? ''
		);
		set__riskRegister__residualRisk__reputationalRiskImpact(
			data?.riskRegister?.residualRisk?.reputationalRiskImpact ?? ''
		);
		set__riskRegister__riskCategory__businessDisruptionRisk(
			data?.riskRegister?.riskCategory?.businessDisruptionRisk ?? ''
		);
		set__riskRegister__riskCategory__cause(
			data?.riskRegister?.riskCategory?.cause ?? ''
		);
		set__riskRegister__riskCategory__causeSubClassification(
			data?.riskRegister?.riskCategory?.causeSubClassification ?? ''
		);
		set__riskRegister__riskCategory__financialRiskImpact(
			data?.riskRegister?.riskCategory?.financialRiskImpact ?? ''
		);
		set__riskRegister__riskCategory__likelihoodScale(
			data?.riskRegister?.riskCategory?.likelihoodScale ?? ''
		);
		set__riskRegister__riskCategory__reputationRiskImpact(
			data?.riskRegister?.riskCategory?.reputationRiskImpact ?? ''
		);
		set__riskRegister__riskCategory__type(
			data?.riskRegister?.riskCategory?.type ?? []
		);
		set__riskRegister__riskControlMeasure__controlDescription(
			data?.riskRegister?.riskControlMeasure?.controlDescription ?? ''
		);
		set__riskRegister__riskControlMeasure__controlDocumentationAndDisseminationRiskImpact(
			data?.riskRegister?.riskControlMeasure
				?.controlDocumentationAndDisseminationRiskImpact ?? ''
		);
		set__riskRegister__riskControlMeasure__controlExecutionRiskImpact(
			data?.riskRegister?.riskControlMeasure?.controlExecutionRiskImpact ?? ''
		);
		set__riskRegister__riskControlMeasure__levelsOfControlExecutionRiskImpact(
			data?.riskRegister?.riskControlMeasure
				?.levelsOfControlExecutionRiskImpact ?? ''
		);
		set__riskRegister__riskControlMeasure__monitoringPeriodicityRiskImpact(
			data?.riskRegister?.riskControlMeasure?.monitoringPeriodicityRiskImpact ??
				''
		);
		set__riskRegister__riskControlMeasure__natureOfControlsRiskImpact(
			data?.riskRegister?.riskControlMeasure?.natureOfControlsRiskImpact ?? ''
		);
	};
	/* Utility function to generate the expected form output as a json object */
	const getFormData = useCallback(() => {
		const formData: any = {};
		formData.riskRegister = {};
		formData.riskRegister.primaryRiskInfo = {};
		formData.riskRegister.primaryRiskInfo.department =
			riskRegister__primaryRiskInfo__department;
		formData.riskRegister.primaryRiskInfo.division =
			riskRegister__primaryRiskInfo__division;
		formData.riskRegister.primaryRiskInfo.financialYear =
			riskRegister__primaryRiskInfo__financialYear;
		formData.riskRegister.primaryRiskInfo.objectiveOfProcess =
			riskRegister__primaryRiskInfo__objectiveOfProcess;
		formData.riskRegister.primaryRiskInfo.processName =
			riskRegister__primaryRiskInfo__processName;
		formData.riskRegister.primaryRiskInfo.processType =
			riskRegister__primaryRiskInfo__processType;
		formData.riskRegister.primaryRiskInfo.riskDescriptionPerceivedInherentRisk =
			riskRegister__primaryRiskInfo__riskDescriptionPerceivedInherentRisk;
		formData.riskRegister.primaryRiskInfo.riskReportedBy =
			riskRegister__primaryRiskInfo__riskReportedBy;
		formData.riskRegister.reason = {};
		formData.riskRegister.reason.comments = riskRegister__reason__comments;
		formData.riskRegister.reason.reasons = riskRegister__reason__reasons;
		formData.riskRegister.residualRisk = {};
		formData.riskRegister.residualRisk.financialRisk =
			riskRegister__residualRisk__financialRisk;
		formData.riskRegister.residualRisk.likelihoodScale =
			riskRegister__residualRisk__likelihoodScale;
		formData.riskRegister.residualRisk.reputationalRiskImpact =
			riskRegister__residualRisk__reputationalRiskImpact;
		formData.riskRegister.riskCategory = {};
		formData.riskRegister.riskCategory.businessDisruptionRisk =
			riskRegister__riskCategory__businessDisruptionRisk;
		formData.riskRegister.riskCategory.cause =
			riskRegister__riskCategory__cause;
		formData.riskRegister.riskCategory.causeSubClassification =
			riskRegister__riskCategory__causeSubClassification;
		formData.riskRegister.riskCategory.financialRiskImpact =
			riskRegister__riskCategory__financialRiskImpact;
		formData.riskRegister.riskCategory.likelihoodScale =
			riskRegister__riskCategory__likelihoodScale;
		formData.riskRegister.riskCategory.reputationRiskImpact =
			riskRegister__riskCategory__reputationRiskImpact;
		formData.riskRegister.riskCategory.type = riskRegister__riskCategory__type;
		formData.riskRegister.riskControlMeasure = {};
		formData.riskRegister.riskControlMeasure.controlDescription =
			riskRegister__riskControlMeasure__controlDescription;
		formData.riskRegister.riskControlMeasure.controlDocumentationAndDisseminationRiskImpact =
			riskRegister__riskControlMeasure__controlDocumentationAndDisseminationRiskImpact;
		formData.riskRegister.riskControlMeasure.controlExecutionRiskImpact =
			riskRegister__riskControlMeasure__controlExecutionRiskImpact;
		formData.riskRegister.riskControlMeasure.levelsOfControlExecutionRiskImpact =
			riskRegister__riskControlMeasure__levelsOfControlExecutionRiskImpact;
		formData.riskRegister.riskControlMeasure.monitoringPeriodicityRiskImpact =
			riskRegister__riskControlMeasure__monitoringPeriodicityRiskImpact;
		formData.riskRegister.riskControlMeasure.natureOfControlsRiskImpact =
			riskRegister__riskControlMeasure__natureOfControlsRiskImpact;
		return formData;
	}, [
		riskRegister__primaryRiskInfo__department,
		riskRegister__primaryRiskInfo__division,
		riskRegister__primaryRiskInfo__financialYear,
		riskRegister__primaryRiskInfo__objectiveOfProcess,
		riskRegister__primaryRiskInfo__processName,
		riskRegister__primaryRiskInfo__processType,
		riskRegister__primaryRiskInfo__riskDescriptionPerceivedInherentRisk,
		riskRegister__primaryRiskInfo__riskReportedBy,
		riskRegister__reason__comments,
		riskRegister__reason__reasons,
		riskRegister__residualRisk__financialRisk,
		riskRegister__residualRisk__likelihoodScale,
		riskRegister__residualRisk__reputationalRiskImpact,
		riskRegister__riskCategory__businessDisruptionRisk,
		riskRegister__riskCategory__cause,
		riskRegister__riskCategory__causeSubClassification,
		riskRegister__riskCategory__financialRiskImpact,
		riskRegister__riskCategory__likelihoodScale,
		riskRegister__riskCategory__reputationRiskImpact,
		riskRegister__riskCategory__type,
		riskRegister__riskControlMeasure__controlDescription,
		riskRegister__riskControlMeasure__controlDocumentationAndDisseminationRiskImpact,
		riskRegister__riskControlMeasure__controlExecutionRiskImpact,
		riskRegister__riskControlMeasure__levelsOfControlExecutionRiskImpact,
		riskRegister__riskControlMeasure__monitoringPeriodicityRiskImpact,
		riskRegister__riskControlMeasure__natureOfControlsRiskImpact,
	]);
	/* Utility function to validate the form on the 'beforeSubmit' Lifecycle Hook */
	const validateForm = useCallback(() => {}, []);
	/* Utility function to perform actions on the on the 'afterSubmit' Lifecycle Hook */
	const afterSubmit = useCallback((result) => {}, []);
	useEffect(() => {
		if (formApi) {
			/*
        Form Lifecycle Hook that will be executed before the form is submitted.
        Throwing an error will stop the form submit. Usually should be used to validate the form.
      */
			formApi.beforeSubmit = () => validateForm();
			/*
        Form Lifecycle Hook that will be executed after the form is submitted.
        It will receive a response object containing the `type` flag indicating if the submit has been successful and `info` with extra information about the submit result.
      */
			formApi.afterSubmit = (result) => afterSubmit(result);
			/* Generates the expected form output object to be posted */
			formApi.getFormData = () => getFormData();
		}
	}, [getFormData, validateForm, afterSubmit]);
	useEffect(() => {
		/*
      Call to the Kogito console form engine. It will establish the connection with the console embeding the form
      and return an instance of FormAPI that will allow hook custom code into the form lifecycle.
      The `window.Form.openForm` call expects an object with the following entries:
        - onOpen: Callback that will be called after the connection with the console is established. The callback
        will receive the following arguments:
          - data: the data to be bound into the form
          - ctx: info about the context where the form is being displayed. This will contain information such as the form JSON Schema, process/task, user...
    */
		const api = window.Form.openForm({
			onOpen: (data, context) => {
				setFormData(data);
			},
		});
		setFormApi(api);
	}, []);
	const parseDate = (date?: string): string => {
		if (!date) {
			return '';
		}
		const dateValue: Date = new Date(Date.parse(date));
		return dateValue.toISOString().slice(0, -14);
	};
	const parseTime = (date?: string): string => {
		if (!date) {
			return '';
		}
		const dateValue: Date = new Date(Date.parse(date));
		let isAm = true;
		let hours = dateValue.getHours();
		if (hours > 12) {
			hours %= 12;
			isAm = false;
		}
		let minutes = dateValue.getMinutes().toString();
		if (minutes.length == 1) {
			minutes = '0' + minutes;
		}
		return `${hours}:${minutes} ${isAm ? 'AM' : 'PM'}`;
	};
	return (
		<div className={'pf-v5-c-form'}>
			<Card>
				<CardBody className='pf-v5-c-form'>
					<label>
						<b>Risk register</b>
					</label>
					<Card>
						<CardBody className='pf-v5-c-form'>
							<label>
								<b>Primary risk info</b>
							</label>
							<FormGroup
								fieldId={'uniforms-0000-0004'}
								label={'Department'}
								isRequired={false}>
								<TextInput
									name={'riskRegister.primaryRiskInfo.department'}
									id={'uniforms-0000-0004'}
									isDisabled={false}
									placeholder={''}
									type={'text'}
									value={riskRegister__primaryRiskInfo__department}
									onChange={(e, newValue) =>
										set__riskRegister__primaryRiskInfo__department(newValue)
									}
								/>
							</FormGroup>
							<FormGroup
								fieldId={'uniforms-0000-0005'}
								label={'Division'}
								isRequired={false}>
								<TextInput
									name={'riskRegister.primaryRiskInfo.division'}
									id={'uniforms-0000-0005'}
									isDisabled={false}
									placeholder={''}
									type={'text'}
									value={riskRegister__primaryRiskInfo__division}
									onChange={(e, newValue) =>
										set__riskRegister__primaryRiskInfo__division(newValue)
									}
								/>
							</FormGroup>
							<FormGroup
								fieldId={'uniforms-0000-0006'}
								label={'Financial year'}
								isRequired={false}>
								<DatePicker
									id={'date-picker-uniforms-0000-0006'}
									isDisabled={false}
									name={'riskRegister.primaryRiskInfo.financialYear'}
									value={parseDate(
										riskRegister__primaryRiskInfo__financialYear
									)}
									onChange={(e, newDate) =>
										onDateChange(
											newDate,
											set__riskRegister__primaryRiskInfo__financialYear,
											riskRegister__primaryRiskInfo__financialYear
										)
									}
								/>
							</FormGroup>
							<FormGroup
								fieldId={'uniforms-0000-0007'}
								label={'Objective of process'}
								isRequired={false}>
								<TextInput
									name={'riskRegister.primaryRiskInfo.objectiveOfProcess'}
									id={'uniforms-0000-0007'}
									isDisabled={false}
									placeholder={''}
									type={'text'}
									value={riskRegister__primaryRiskInfo__objectiveOfProcess}
									onChange={(e, newValue) =>
										set__riskRegister__primaryRiskInfo__objectiveOfProcess(
											newValue
										)
									}
								/>
							</FormGroup>
							<FormGroup
								fieldId={'uniforms-0000-0008'}
								label={'Process name'}
								isRequired={false}>
								<TextInput
									name={'riskRegister.primaryRiskInfo.processName'}
									id={'uniforms-0000-0008'}
									isDisabled={false}
									placeholder={''}
									type={'text'}
									value={riskRegister__primaryRiskInfo__processName}
									onChange={(e, newValue) =>
										set__riskRegister__primaryRiskInfo__processName(newValue)
									}
								/>
							</FormGroup>
							<FormGroup
								fieldId={'uniforms-0000-0009'}
								label={'Process type'}
								isRequired={false}>
								<TextInput
									name={'riskRegister.primaryRiskInfo.processType'}
									id={'uniforms-0000-0009'}
									isDisabled={false}
									placeholder={''}
									type={'text'}
									value={riskRegister__primaryRiskInfo__processType}
									onChange={(e, newValue) =>
										set__riskRegister__primaryRiskInfo__processType(newValue)
									}
								/>
							</FormGroup>
							<FormGroup
								fieldId={'uniforms-0000-000a'}
								label={'Risk description perceived inherent risk'}
								isRequired={false}>
								<TextInput
									name={
										'riskRegister.primaryRiskInfo.riskDescriptionPerceivedInherentRisk'
									}
									id={'uniforms-0000-000a'}
									isDisabled={false}
									placeholder={''}
									type={'text'}
									value={
										riskRegister__primaryRiskInfo__riskDescriptionPerceivedInherentRisk
									}
									onChange={(e, newValue) =>
										set__riskRegister__primaryRiskInfo__riskDescriptionPerceivedInherentRisk(
											newValue
										)
									}
								/>
							</FormGroup>
							<FormGroup
								fieldId={'uniforms-0000-000b'}
								label={'Risk reported by'}
								isRequired={false}>
								<TextInput
									name={'riskRegister.primaryRiskInfo.riskReportedBy'}
									id={'uniforms-0000-000b'}
									isDisabled={false}
									placeholder={''}
									type={'text'}
									value={riskRegister__primaryRiskInfo__riskReportedBy}
									onChange={(e, newValue) =>
										set__riskRegister__primaryRiskInfo__riskReportedBy(newValue)
									}
								/>
							</FormGroup>
						</CardBody>
					</Card>
					<Card>
						<CardBody className='pf-v5-c-form'>
							<label>
								<b>Reason</b>
							</label>
							<FormGroup
								fieldId={'uniforms-0000-000e'}
								label={'Comments'}
								isRequired={false}>
								<TextInput
									name={'riskRegister.reason.comments'}
									id={'uniforms-0000-000e'}
									isDisabled={false}
									placeholder={''}
									type={'text'}
									value={riskRegister__reason__comments}
									onChange={(e, newValue) =>
										set__riskRegister__reason__comments(newValue)
									}
								/>
							</FormGroup>
							<FormGroup
								fieldId={'uniforms-0000-000f'}
								label={'Reasons'}
								isRequired={false}>
								<TextInput
									name={'riskRegister.reason.reasons'}
									id={'uniforms-0000-000f'}
									isDisabled={false}
									placeholder={''}
									type={'text'}
									value={riskRegister__reason__reasons}
									onChange={(e, newValue) =>
										set__riskRegister__reason__reasons(newValue)
									}
								/>
							</FormGroup>
						</CardBody>
					</Card>
					<Card>
						<CardBody className='pf-v5-c-form'>
							<label>
								<b>Residual risk</b>
							</label>
							<FormGroup
								fieldId={'uniforms-0000-000i'}
								label={'Financial risk'}
								isRequired={false}>
								<TextInput
									name={'riskRegister.residualRisk.financialRisk'}
									id={'uniforms-0000-000i'}
									isDisabled={false}
									placeholder={''}
									type={'text'}
									value={riskRegister__residualRisk__financialRisk}
									onChange={(e, newValue) =>
										set__riskRegister__residualRisk__financialRisk(newValue)
									}
								/>
							</FormGroup>
							<FormGroup
								fieldId={'uniforms-0000-000j'}
								label={'Likelihood scale'}
								isRequired={false}>
								<TextInput
									name={'riskRegister.residualRisk.likelihoodScale'}
									id={'uniforms-0000-000j'}
									isDisabled={false}
									placeholder={''}
									type={'text'}
									value={riskRegister__residualRisk__likelihoodScale}
									onChange={(e, newValue) =>
										set__riskRegister__residualRisk__likelihoodScale(newValue)
									}
								/>
							</FormGroup>
							<FormGroup
								fieldId={'uniforms-0000-000k'}
								label={'Reputational risk impact'}
								isRequired={false}>
								<TextInput
									name={'riskRegister.residualRisk.reputationalRiskImpact'}
									id={'uniforms-0000-000k'}
									isDisabled={false}
									placeholder={''}
									type={'text'}
									value={riskRegister__residualRisk__reputationalRiskImpact}
									onChange={(e, newValue) =>
										set__riskRegister__residualRisk__reputationalRiskImpact(
											newValue
										)
									}
								/>
							</FormGroup>
						</CardBody>
					</Card>
					<Card>
						<CardBody className='pf-v5-c-form'>
							<label>
								<b>Risk category</b>
							</label>
							<FormGroup
								fieldId={'uniforms-0000-000n'}
								label={'Business disruption risk'}
								isRequired={false}>
								<TextInput
									name={'riskRegister.riskCategory.businessDisruptionRisk'}
									id={'uniforms-0000-000n'}
									isDisabled={false}
									placeholder={''}
									type={'text'}
									value={riskRegister__riskCategory__businessDisruptionRisk}
									onChange={(e, newValue) =>
										set__riskRegister__riskCategory__businessDisruptionRisk(
											newValue
										)
									}
								/>
							</FormGroup>
							<FormGroup
								fieldId={'uniforms-0000-000o'}
								label={'Cause'}
								isRequired={false}>
								<TextInput
									name={'riskRegister.riskCategory.cause'}
									id={'uniforms-0000-000o'}
									isDisabled={false}
									placeholder={''}
									type={'text'}
									value={riskRegister__riskCategory__cause}
									onChange={(e, newValue) =>
										set__riskRegister__riskCategory__cause(newValue)
									}
								/>
							</FormGroup>
							<FormGroup
								fieldId={'uniforms-0000-000p'}
								label={'Cause sub classification'}
								isRequired={false}>
								<TextInput
									name={'riskRegister.riskCategory.causeSubClassification'}
									id={'uniforms-0000-000p'}
									isDisabled={false}
									placeholder={''}
									type={'text'}
									value={riskRegister__riskCategory__causeSubClassification}
									onChange={(e, newValue) =>
										set__riskRegister__riskCategory__causeSubClassification(
											newValue
										)
									}
								/>
							</FormGroup>
							<FormGroup
								fieldId={'uniforms-0000-000q'}
								label={'Financial risk impact'}
								isRequired={false}>
								<TextInput
									name={'riskRegister.riskCategory.financialRiskImpact'}
									id={'uniforms-0000-000q'}
									isDisabled={false}
									placeholder={''}
									type={'text'}
									value={riskRegister__riskCategory__financialRiskImpact}
									onChange={(e, newValue) =>
										set__riskRegister__riskCategory__financialRiskImpact(
											newValue
										)
									}
								/>
							</FormGroup>
							<FormGroup
								fieldId={'uniforms-0000-000r'}
								label={'Likelihood scale'}
								isRequired={false}>
								<TextInput
									name={'riskRegister.riskCategory.likelihoodScale'}
									id={'uniforms-0000-000r'}
									isDisabled={false}
									placeholder={''}
									type={'text'}
									value={riskRegister__riskCategory__likelihoodScale}
									onChange={(e, newValue) =>
										set__riskRegister__riskCategory__likelihoodScale(newValue)
									}
								/>
							</FormGroup>
							<FormGroup
								fieldId={'uniforms-0000-000s'}
								label={'Reputation risk impact'}
								isRequired={false}>
								<TextInput
									name={'riskRegister.riskCategory.reputationRiskImpact'}
									id={'uniforms-0000-000s'}
									isDisabled={false}
									placeholder={''}
									type={'text'}
									value={riskRegister__riskCategory__reputationRiskImpact}
									onChange={(e, newValue) =>
										set__riskRegister__riskCategory__reputationRiskImpact(
											newValue
										)
									}
								/>
							</FormGroup>
							<div>
								<Split hasGutter>
									<SplitItem>
										{'Type' && (
											<label className={'pf-c-form__label'}>
												<span className={'pf-c-form__label-text'}>Type</span>
											</label>
										)}
									</SplitItem>
									<SplitItem isFilled />
									<SplitItem>
										<Button
											name='$'
											variant='plain'
											style={{ paddingLeft: '0', paddingRight: '0' }}
											disabled={false}
											onClick={() => {
												!false &&
													set__riskRegister__riskCategory__type(
														(riskRegister__riskCategory__type ?? []).concat([
															'',
														])
													);
											}}>
											<PlusCircleIcon color='#0088ce' />
										</Button>
									</SplitItem>
								</Split>
								<div>
									{riskRegister__riskCategory__type?.map((_, itemIndex) => (
										<div
											key={itemIndex}
											style={{
												marginBottom: '1rem',
												display: 'flex',
												justifyContent: 'space-between',
											}}>
											<div style={{ width: '100%', marginRight: '10px' }}>
												<FormGroup
													fieldId={'uniforms-0000-000v'}
													label={''}
													isRequired={false}>
													<TextInput
														name={`riskRegister__riskCategory__type.${itemIndex}`}
														id={'uniforms-0000-000v'}
														isDisabled={false}
														placeholder={''}
														type={'text'}
														value={
															riskRegister__riskCategory__type?.[itemIndex]
														}
														onChange={(e, newValue) => {
															set__riskRegister__riskCategory__type((s) => {
																const newState = [...s];
																newState[itemIndex] = newValue;
																return newState;
															});
														}}
													/>
												</FormGroup>
											</div>
											<div>
												<Button
													disabled={false}
													variant='plain'
													style={{ paddingLeft: '0', paddingRight: '0' }}
													onClick={() => {
														const value = [...riskRegister__riskCategory__type];
														value.splice(itemIndex, 1);
														!false &&
															set__riskRegister__riskCategory__type(value);
													}}>
													<MinusCircleIcon color='#cc0000' />
												</Button>
											</div>
										</div>
									))}
								</div>
							</div>
						</CardBody>
					</Card>
					<Card>
						<CardBody className='pf-v5-c-form'>
							<label>
								<b>Risk control measure</b>
							</label>
							<FormGroup
								fieldId={'uniforms-0000-000y'}
								label={'Control description'}
								isRequired={false}>
								<TextInput
									name={'riskRegister.riskControlMeasure.controlDescription'}
									id={'uniforms-0000-000y'}
									isDisabled={false}
									placeholder={''}
									type={'text'}
									value={riskRegister__riskControlMeasure__controlDescription}
									onChange={(e, newValue) =>
										set__riskRegister__riskControlMeasure__controlDescription(
											newValue
										)
									}
								/>
							</FormGroup>
							<FormGroup
								fieldId={'uniforms-0000-000z'}
								label={'Control documentation and dissemination risk impact'}
								isRequired={false}>
								<TextInput
									name={
										'riskRegister.riskControlMeasure.controlDocumentationAndDisseminationRiskImpact'
									}
									id={'uniforms-0000-000z'}
									isDisabled={false}
									placeholder={''}
									type={'text'}
									value={
										riskRegister__riskControlMeasure__controlDocumentationAndDisseminationRiskImpact
									}
									onChange={(e, newValue) =>
										set__riskRegister__riskControlMeasure__controlDocumentationAndDisseminationRiskImpact(
											newValue
										)
									}
								/>
							</FormGroup>
							<FormGroup
								fieldId={'uniforms-0000-0010'}
								label={'Control execution risk impact'}
								isRequired={false}>
								<TextInput
									name={
										'riskRegister.riskControlMeasure.controlExecutionRiskImpact'
									}
									id={'uniforms-0000-0010'}
									isDisabled={false}
									placeholder={''}
									type={'text'}
									value={
										riskRegister__riskControlMeasure__controlExecutionRiskImpact
									}
									onChange={(e, newValue) =>
										set__riskRegister__riskControlMeasure__controlExecutionRiskImpact(
											newValue
										)
									}
								/>
							</FormGroup>
							<FormGroup
								fieldId={'uniforms-0000-0011'}
								label={'Levels of control execution risk impact'}
								isRequired={false}>
								<TextInput
									name={
										'riskRegister.riskControlMeasure.levelsOfControlExecutionRiskImpact'
									}
									id={'uniforms-0000-0011'}
									isDisabled={false}
									placeholder={''}
									type={'text'}
									value={
										riskRegister__riskControlMeasure__levelsOfControlExecutionRiskImpact
									}
									onChange={(e, newValue) =>
										set__riskRegister__riskControlMeasure__levelsOfControlExecutionRiskImpact(
											newValue
										)
									}
								/>
							</FormGroup>
							<FormGroup
								fieldId={'uniforms-0000-0012'}
								label={'Monitoring periodicity risk impact'}
								isRequired={false}>
								<TextInput
									name={
										'riskRegister.riskControlMeasure.monitoringPeriodicityRiskImpact'
									}
									id={'uniforms-0000-0012'}
									isDisabled={false}
									placeholder={''}
									type={'text'}
									value={
										riskRegister__riskControlMeasure__monitoringPeriodicityRiskImpact
									}
									onChange={(e, newValue) =>
										set__riskRegister__riskControlMeasure__monitoringPeriodicityRiskImpact(
											newValue
										)
									}
								/>
							</FormGroup>
							<FormGroup
								fieldId={'uniforms-0000-0013'}
								label={'Nature of controls risk impact'}
								isRequired={false}>
								<TextInput
									name={
										'riskRegister.riskControlMeasure.natureOfControlsRiskImpact'
									}
									id={'uniforms-0000-0013'}
									isDisabled={false}
									placeholder={''}
									type={'text'}
									value={
										riskRegister__riskControlMeasure__natureOfControlsRiskImpact
									}
									onChange={(e, newValue) =>
										set__riskRegister__riskControlMeasure__natureOfControlsRiskImpact(
											newValue
										)
									}
								/>
							</FormGroup>
						</CardBody>
					</Card>
				</CardBody>
			</Card>
		</div>
	);
};
export default Form__RiskRegisterProcess_Maker_Submit_RR;
