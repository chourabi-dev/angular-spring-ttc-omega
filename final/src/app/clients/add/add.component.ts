import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { ApiService } from '../api.service';

@Component({
  selector: 'app-add',
  templateUrl: './add.component.html',
  styleUrls: ['./add.component.css']
})
export class AddComponent implements OnInit {


  formData = new FormGroup({
    nom : new FormControl('',Validators.required),
    prenom : new FormControl('',Validators.required),
    email : new FormControl('',Validators.required),
    cin : new FormControl('',Validators.required),
    address : new FormControl('',Validators.required)
    
  })

  successMessage="";
  errorMessage="";
  
  constructor(private api:ApiService) { }

  ngOnInit(): void {
  }


  saveData(){
    this.api.addNewClient(this.formData.value).toPromise().then((data:any)=>{
      if (data.id != null) {
        this.successMessage = 'Client inserted successfully.';

        this.formData.reset();
        
      }else{
        this.errorMessage = 'Something went wrong please try again.'; 
      }
      
    }).catch((err)=>{
      this.errorMessage = 'Something went wrong please try again.';
    })
  }

}
