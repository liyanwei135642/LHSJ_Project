<template>
  <div class="row justify-content-center">
    <div class="col-8">
      <form name="editForm" role="form" novalidate v-on:submit.prevent="save()">
        <h2
          id="jhiStarterApp.company.home.createOrEditLabel"
          data-cy="CompanyCreateUpdateHeading"
          v-text="$t('jhiStarterApp.company.home.createOrEditLabel')"
        >
          Create or edit a Company
        </h2>
        <div>
          <div class="form-group" v-if="company.id">
            <label for="id" v-text="$t('global.field.id')">ID</label>
            <input type="text" class="form-control" id="id" name="id" v-model="company.id" readonly />
          </div>
          <div class="form-group">
            <label class="form-control-label" v-text="$t('jhiStarterApp.company.name')" for="company-name">Name</label>
            <input
              type="text"
              class="form-control"
              name="name"
              id="company-name"
              data-cy="name"
              :class="{ valid: !$v.company.name.$invalid, invalid: $v.company.name.$invalid }"
              v-model="$v.company.name.$model"
            />
          </div>
          <div class="form-group">
            <label class="form-control-label" v-text="$t('jhiStarterApp.company.uscc')" for="company-uscc">Uscc</label>
            <input
              type="text"
              class="form-control"
              name="uscc"
              id="company-uscc"
              data-cy="uscc"
              :class="{ valid: !$v.company.uscc.$invalid, invalid: $v.company.uscc.$invalid }"
              v-model="$v.company.uscc.$model"
            />
          </div>
          <div class="form-group">
            <label class="form-control-label" v-text="$t('jhiStarterApp.company.principal')" for="company-principal">Principal</label>
            <input
              type="text"
              class="form-control"
              name="principal"
              id="company-principal"
              data-cy="principal"
              :class="{ valid: !$v.company.principal.$invalid, invalid: $v.company.principal.$invalid }"
              v-model="$v.company.principal.$model"
            />
          </div>
          <div class="form-group">
            <label class="form-control-label" v-text="$t('jhiStarterApp.company.phone')" for="company-phone">Phone</label>
            <input
              type="text"
              class="form-control"
              name="phone"
              id="company-phone"
              data-cy="phone"
              :class="{ valid: !$v.company.phone.$invalid, invalid: $v.company.phone.$invalid }"
              v-model="$v.company.phone.$model"
            />
          </div>
          <div class="form-group">
            <label class="form-control-label" v-text="$t('jhiStarterApp.company.settleTime')" for="company-settleTime">Settle Time</label>
            <div class="d-flex">
              <input
                id="company-settleTime"
                data-cy="settleTime"
                type="datetime-local"
                class="form-control"
                name="settleTime"
                :class="{ valid: !$v.company.settleTime.$invalid, invalid: $v.company.settleTime.$invalid }"
                :value="convertDateTimeFromServer($v.company.settleTime.$model)"
                @change="updateInstantField('settleTime', $event)"
              />
            </div>
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
            :disabled="$v.company.$invalid || isSaving"
            class="btn btn-primary"
          >
            <font-awesome-icon icon="save"></font-awesome-icon>&nbsp;<span v-text="$t('entity.action.save')">Save</span>
          </button>
        </div>
      </form>
    </div>
  </div>
</template>
<script lang="ts" src="./company-update.component.ts"></script>
