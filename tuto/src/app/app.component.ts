import { Component } from '@angular/core';
import { Employee } from './models/Employee';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  
  username:string="chourbai";
  email="tchourabi@gmail.com";
  year:number = 2022;
  phone;

  theDoorClosed:boolean = true;

  // { firstname lastname }
  //employees:string[] = ["employee 1","employee 2","employee 3","employee 4","employee 4"]

  /*employees:{firstname,lastname}[] = [ 
    { firstname:'chourabi', lastname:'taher' },
    { firstname:"test", lastname:"employee" }
  ]*/

  employees:Employee[] = [
    new Employee('chourabi','taher')
  ]


}
