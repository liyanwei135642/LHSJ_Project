export interface ICompany {
  id?: number;
  name?: string | null;
  uscc?: string | null;
  principal?: string | null;
  phone?: string | null;
  settleTime?: Date | null;
}

export class Company implements ICompany {
  constructor(
    public id?: number,
    public name?: string | null,
    public uscc?: string | null,
    public principal?: string | null,
    public phone?: string | null,
    public settleTime?: Date | null
  ) {}
}
