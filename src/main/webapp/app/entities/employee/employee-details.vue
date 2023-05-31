<template>
  <div class="row justify-content-center">
    <div class="col-8">
      <div v-if="employee">
        <h2 class="jh-entity-heading" data-cy="employeeDetailsHeading">
          <span v-text="$t('jhiStarterApp.employee.detail.title')">Employee</span> {{ employee.id }}
        </h2>
        <dl class="row jh-entity-details">
          <dt>
            <span v-text="$t('jhiStarterApp.employee.name')">Name</span>
          </dt>
          <dd>
            <span>{{ employee.name }}</span>
          </dd>
          <dt>
            <span v-text="$t('jhiStarterApp.employee.phone')">Phone</span>
          </dt>
          <dd>
            <span>{{ employee.phone }}</span>
          </dd>
          <dt>
            <span v-text="$t('jhiStarterApp.employee.idType')">Id Type</span>
          </dt>
          <dd>
            <span v-text="$t('jhiStarterApp.IDType.' + employee.idType)">{{ employee.idType }}</span>
          </dd>
          <dt>
            <span v-text="$t('jhiStarterApp.employee.idNumber')">Id Number</span>
          </dt>
          <dd>
            <span>{{ employee.idNumber }}</span>
          </dd>
          <dt>
            <span v-text="$t('jhiStarterApp.employee.company')">Company</span>
          </dt>
          <dd>
            <div v-if="employee.company">
              <router-link :to="{ name: 'CompanyView', params: { companyId: employee.company.id } }">{{ employee.company.id }}</router-link>
            </div>
          </dd>
        </dl>
        <button type="submit" v-on:click.prevent="previousState()" class="btn btn-info" data-cy="entityDetailsBackButton">
          <font-awesome-icon icon="arrow-left"></font-awesome-icon>&nbsp;<span v-text="$t('entity.action.back')"> Back</span>
        </button>
        <router-link v-if="employee.id" :to="{ name: 'EmployeeEdit', params: { employeeId: employee.id } }" custom v-slot="{ navigate }">
          <button @click="navigate" class="btn btn-primary">
            <font-awesome-icon icon="pencil-alt"></font-awesome-icon>&nbsp;<span v-text="$t('entity.action.edit')"> Edit</span>
          </button>
        </router-link>
      </div>
    </div>
  </div>
</template>

<script lang="ts" src="./employee-details.component.ts"></script>
