import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { AuthService } from 'src/app/auth.service';

@Component({
  selector: 'app-signin-page',
  templateUrl: './signin-page.component.html',
  styleUrls: ['./signin-page.component.css']
})
export class SigninPageComponent implements OnInit {

  form = new FormGroup({
    username: new FormControl('',Validators.required),
    password: new FormControl('',Validators.required),
    
  })
  constructor(private auth:AuthService, private router:Router) { }

  ngOnInit(): void {
  }

  submitConnectForm(){
    const val = this.form.value;

    if (val.username=== 'admin' && val.password==='admin' ) {
      this.auth.connect();
      // redirect home page

      this.router.navigateByUrl('/');

    }else{
      alert('wrong username or password.')
    }
  }

}
