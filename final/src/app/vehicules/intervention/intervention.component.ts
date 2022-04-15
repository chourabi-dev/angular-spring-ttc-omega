import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { ActivatedRoute } from '@angular/router';
import { ApiService } from '../api.service';

@Component({
  selector: 'app-intervention',
  templateUrl: './intervention.component.html',
  styleUrls: ['./intervention.component.css']
})
export class InterventionComponent implements OnInit {





  formData = new FormGroup({
    description : new FormControl('',Validators.required), 
    category : new FormControl('',Validators.required)
  })

  successMessage="";
  errorMessage="";
  
  categories:any[]=[];

  constructor(private api:ApiService, private route:ActivatedRoute) { }

  ngOnInit(): void {
    this.initData();
  }

  initData(){
    this.api.getCategoriesList().toPromise().then((res:any[])=>{
      this.categories = res;
    })
  }


  saveData(){
    const id = this.route.snapshot.params.id;

    let data  = this.formData.value;
    data.vehicule = id;

 

    this.api.addIntervention(data).toPromise().then((data:any)=>{
      if (data.id != null) {
        this.successMessage = 'Intervention inserted successfully.';

        this.formData.reset();
        
      }else{
        this.errorMessage = 'Something went wrong please try again.'; 
      }
      
    }).catch((err)=>{
      this.errorMessage = 'Something went wrong please try again.';
    })
    

   
  }

}
