import { ICompany } from '@/shared/model/company.model';

import { IDType } from '@/shared/model/enumerations/id-type.model';
export interface IEmployee {
  id?: number;
  name?: string | null;
  phone?: string | null;
  idType?: IDType | null;
  idNumber?: string | null;
  company?: ICompany | null;
}

export class Employee implements IEmployee {
  constructor(
    public id?: number,
    public name?: string | null,
    public phone?: string | null,
    public idType?: IDType | null,
    public idNumber?: string | null,
    public company?: ICompany | null
  ) {}
}
