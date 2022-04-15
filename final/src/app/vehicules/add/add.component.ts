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
    mark : new FormControl('',Validators.required),
    model : new FormControl('',Validators.required),
    color : new FormControl('',Validators.required),
    client : new FormControl('',Validators.required),
    matricule : new FormControl('',Validators.required)

  
  })

  successMessage="";
  errorMessage="";
  
  clients:any[]=[];

  constructor(private api:ApiService) { }

  ngOnInit(): void {
    this.initData();
  }

  initData(){
    this.api.getClientsList().toPromise().then((res:any[])=>{
      this.clients = res;
    })
  }


  saveData(){
    this.api.addVehicule(this.formData.value).toPromise().then((data:any)=>{
      if (data.id != null) {
        this.successMessage = 'Vehicule inserted successfully.';

        this.formData.reset();
        
      }else{
        this.errorMessage = 'Something went wrong please try again.'; 
      }
      
    }).catch((err)=>{
      this.errorMessage = 'Something went wrong please try again.';
    })
  }

}
