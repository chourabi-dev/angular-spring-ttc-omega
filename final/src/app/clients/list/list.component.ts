import { Component, OnInit } from '@angular/core';
import { ApiService } from '../api.service';

@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.css']
})
export class ListComponent implements OnInit {

  clients:any[] = [];


  msg='';


  constructor(private api:ApiService) { }

  ngOnInit(): void {
    this.initData();
  }

  initData(){
    this.api.getClientsList().toPromise().then((data:any[])=>{
      console.log(data);

      this.clients = data;
      
    }).catch( (error)=>{
      console.log(error);
      
    } )
  }


  deleteClient(id){ 

    this.api.deleteClientByID(id).toPromise().then((res:any)=>{
      if (res.success === true) {
        this.msg='Clients N°'+id+' deleted successfully. ';
        this.initData();


        setTimeout(()=>{
          this.msg='';
        },5000)


      }
    })
    
  }

}
