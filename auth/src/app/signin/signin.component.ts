import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { ApiService } from '../api.service';

@Component({
  selector: 'app-signin',
  templateUrl: './signin.component.html',
  styleUrls: ['./signin.component.css']
})
export class SigninComponent implements OnInit {

  formData = new FormGroup({ 
    username : new FormControl('',Validators.required), 
    password : new FormControl('',Validators.required)  



  })
  constructor(private api:ApiService,private router:Router) { }

  ngOnInit(): void {
  }


  authUser(){
    let data = this.formData.value;

    data.role=["pm"];

    console.log(data);

    this.api.signin(data).toPromise().then((res:any)=>{
      console.log(res);

      let token  = res.tokenType+' '+res.accessToken;
      localStorage.setItem('token',token);

      this.router.navigateByUrl('/');
      
    })
    
  }
}
