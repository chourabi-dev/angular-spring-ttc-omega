import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { ApiService } from '../api.service';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {

  formData = new FormGroup({
    name : new FormControl('',Validators.required),
    username : new FormControl('',Validators.required),
    email : new FormControl('',Validators.required), 
    password : new FormControl('',Validators.required),
    cindId : new FormControl('',Validators.required), 



  })
  constructor(private api:ApiService) { }

  ngOnInit(): void {
  }


  createUser(){
    let data = this.formData.value;

    data.role=["pm"];

    console.log(data);

    this.api.signup(data).toPromise().then((res)=>{
      console.log(res);
      
    })
    
  }
}
