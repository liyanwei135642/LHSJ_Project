<template>
  <div class="row justify-content-center">
    <div class="col-8">
      <div v-if="company">
        <h2 class="jh-entity-heading" data-cy="companyDetailsHeading">
          <span v-text="$t('jhiStarterApp.company.detail.title')">Company</span> {{ company.id }}
        </h2>
        <dl class="row jh-entity-details">
          <dt>
            <span v-text="$t('jhiStarterApp.company.name')">Name</span>
          </dt>
          <dd>
            <span>{{ company.name }}</span>
          </dd>
          <dt>
            <span v-text="$t('jhiStarterApp.company.uscc')">Uscc</span>
          </dt>
          <dd>
            <span>{{ company.uscc }}</span>
          </dd>
          <dt>
            <span v-text="$t('jhiStarterApp.company.principal')">Principal</span>
          </dt>
          <dd>
            <span>{{ company.principal }}</span>
          </dd>
          <dt>
            <span v-text="$t('jhiStarterApp.company.phone')">Phone</span>
          </dt>
          <dd>
            <span>{{ company.phone }}</span>
          </dd>
          <dt>
            <span v-text="$t('jhiStarterApp.company.settleTime')">Settle Time</span>
          </dt>
          <dd>
            <span v-if="company.settleTime">{{ $d(Date.parse(company.settleTime), 'long') }}</span>
          </dd>
        </dl>
        <button type="submit" v-on:click.prevent="previousState()" class="btn btn-info" data-cy="entityDetailsBackButton">
          <font-awesome-icon icon="arrow-left"></font-awesome-icon>&nbsp;<span v-text="$t('entity.action.back')"> Back</span>
        </button>
        <router-link v-if="company.id" :to="{ name: 'CompanyEdit', params: { companyId: company.id } }" custom v-slot="{ navigate }">
          <button @click="navigate" class="btn btn-primary">
            <font-awesome-icon icon="pencil-alt"></font-awesome-icon>&nbsp;<span v-text="$t('entity.action.edit')"> Edit</span>
          </button>
        </router-link>
      </div>
    </div>
  </div>
</template>

<script lang="ts" src="./company-details.component.ts"></script>
