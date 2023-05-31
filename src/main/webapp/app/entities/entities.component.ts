import { Component, Provide, Vue } from 'vue-property-decorator';

import UserService from '@/entities/user/user.service';
import CompanyService from './company/company.service';
import EmployeeService from './employee/employee.service';
// jhipster-needle-add-entity-service-to-entities-component-import - JHipster will import entities services here

@Component
export default class Entities extends Vue {
  @Provide('userService') private userService = () => new UserService();
  @Provide('companyService') private companyService = () => new CompanyService();
  @Provide('employeeService') private employeeService = () => new EmployeeService();
  // jhipster-needle-add-entity-service-to-entities-component - JHipster will import entities services here
}
