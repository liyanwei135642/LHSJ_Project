<template>
  <div class="row justify-content-center">
    <div class="col-8">
      <form name="editForm" role="form" novalidate v-on:submit.prevent="save()">
        <h2
          id="jhiStarterApp.employee.home.createOrEditLabel"
          data-cy="EmployeeCreateUpdateHeading"
          v-text="$t('jhiStarterApp.employee.home.createOrEditLabel')"
        >
          Create or edit a Employee
        </h2>
        <div>
          <div class="form-group" v-if="employee.id">
            <label for="id" v-text="$t('global.field.id')">ID</label>
            <input type="text" class="form-control" id="id" name="id" v-model="employee.id" readonly />
          </div>
          <div class="form-group">
            <label class="form-control-label" v-text="$t('jhiStarterApp.employee.name')" for="employee-name">Name</label>
            <input
              type="text"
              class="form-control"
              name="name"
              id="employee-name"
              data-cy="name"
              :class="{ valid: !$v.employee.name.$invalid, invalid: $v.employee.name.$invalid }"
              v-model="$v.employee.name.$model"
            />
          </div>
          <div class="form-group">
            <label class="form-control-label" v-text="$t('jhiStarterApp.employee.phone')" for="employee-phone">Phone</label>
            <input
              type="text"
              class="form-control"
              name="phone"
              id="employee-phone"
              data-cy="phone"
              :class="{ valid: !$v.employee.phone.$invalid, invalid: $v.employee.phone.$invalid }"
              v-model="$v.employee.phone.$model"
            />
          </div>
          <div class="form-group">
            <label class="form-control-label" v-text="$t('jhiStarterApp.employee.idType')" for="employee-idType">Id Type</label>
            <select
              class="form-control"
              name="idType"
              :class="{ valid: !$v.employee.idType.$invalid, invalid: $v.employee.idType.$invalid }"
              v-model="$v.employee.idType.$model"
              id="employee-idType"
              data-cy="idType"
            >
              <option
                v-for="iDType in iDTypeValues"
                :key="iDType"
                v-bind:value="iDType"
                v-bind:label="$t('jhiStarterApp.IDType.' + iDType)"
              >
                {{ iDType }}
              </option>
            </select>
          </div>
          <div class="form-group">
            <label class="form-control-label" v-text="$t('jhiStarterApp.employee.idNumber')" for="employee-idNumber">Id Number</label>
            <input
              type="text"
              class="form-control"
              name="idNumber"
              id="employee-idNumber"
              data-cy="idNumber"
              :class="{ valid: !$v.employee.idNumber.$invalid, invalid: $v.employee.idNumber.$invalid }"
              v-model="$v.employee.idNumber.$model"
            />
          </div>
          <div class="form-group">
            <label class="form-control-label" v-text="$t('jhiStarterApp.employee.company')" for="employee-company">Company</label>
            <select class="form-control" id="employee-company" data-cy="company" name="company" v-model="employee.company">
              <option v-bind:value="null"></option>
              <option
                v-bind:value="employee.company && companyOption.id === employee.company.id ? employee.company : companyOption"
                v-for="companyOption in companies"
                :key="companyOption.id"
              >
                {{ companyOption.id }}
              </option>
            </select>
          </div>
        </div>
        <div>
          <button type="button" id="cancel-save" data-cy="entityCreateCancelButton" class="btn btn-secondary" v-on:click="previousState()">
            <font-awesome-icon icon="ban"></font-awesome-icon>&nbsp;<span v-text="$t('entity.action.cancel')">Cancel</span>
          </button>
          <button
            type="submit"
            id="save-entity"
            data-cy="entityCreateSaveButton"
            :disabled="$v.employee.$invalid || isSaving"
            class="btn btn-primary"
          >
            <font-awesome-icon icon="save"></font-awesome-icon>&nbsp;<span v-text="$t('entity.action.save')">Save</span>
          </button>
        </div>
      </form>
    </div>
  </div>
</template>
<script lang="ts" src="./employee-update.component.ts"></script>
