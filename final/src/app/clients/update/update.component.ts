import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { ActivatedRoute } from '@angular/router';
import { ApiService } from '../api.service';


@Component({
  selector: 'app-update',
  templateUrl: './update.component.html',
  styleUrls: ['./update.component.css']
})
export class UpdateComponent implements OnInit {

  formData = new FormGroup({
    nom : new FormControl('',Validators.required),
    prenom : new FormControl('',Validators.required),
    email : new FormControl('',Validators.required),
    cin : new FormControl('',Validators.required),
    address : new FormControl('',Validators.required)
    
  })

  successMessage="";
  errorMessage="";
  
  constructor(private api:ApiService, private route:ActivatedRoute) { }

  ngOnInit(): void {
    this.initData();
  }


  initData(){
    const id = this.route.snapshot.params.id;

    this.api.findClientByID(id).toPromise().then((data:any)=>{
       
      let tmp  = data;

      delete tmp.vehicules;
      delete tmp.id;
      

      this.formData.setValue(tmp );
      
    })
  }


  saveData(){
    const id = this.route.snapshot.params.id;

    this.api.updateClient(this.formData.value,id).toPromise().then((data:any)=>{
      if (data.id != null) {
        this.successMessage = 'Client updated successfully.'; 
        
      }else{
        this.errorMessage = 'Something went wrong please try again.'; 
      }
      
    }).catch((err)=>{
      this.errorMessage = 'Something went wrong please try again.';
    })
  }


}
