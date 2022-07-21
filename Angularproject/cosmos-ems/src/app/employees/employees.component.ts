import { Component,  OnDestroy, OnInit } from '@angular/core';
import { EmployeeService } from './employee.service';
import { Subscription } from 'rxjs';
// import  employees  from './data/employees.json';
import { Employee } from './Employees.model';

@Component({
  selector: 'em-employees',
  templateUrl: './employees.component.html',
  styleUrls: ['./employees.component.scss']
})
export class EmployeesComponent implements OnInit , OnDestroy{

  title:string ="Employee Management Solutions"
  // employees:Employee[] = employees;
  employees!:Employee[];
  // filteredEmployees:Employee[] = employees;
  filteredEmployees!:Employee[];
  showIcon:boolean =false;
  substriber!: Subscription;
  message:string='';
 private _designationFilter:string = '';

 set designationFilter(value:string){
  //console.log("setter fired" + value);
  this._designationFilter=value;
  this.filterByDesignation()
 }

 get designationFilter():string{
  return this._designationFilter;
 }
  constructor(private employeeService:EmployeeService) { }

  ngOnInit(): void {
    this.substriber = this.employeeService.getEmployees().subscribe({
      next: data => {
        this.filteredEmployees = data;
        this.employees = this.filteredEmployees
      }
    })
  }

  ngOnDestroy() {
    this.substriber.unsubscribe();
  }
  toggleIcon(){
  this.showIcon = !this.showIcon;
}

filterByDesignation(){
 this.filteredEmployees= this.employees.filter(employee=>employee.designation.includes(this.designationFilter))
}

onMessageRecived(value:string){
  this.message=value;
}

}
