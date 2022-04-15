import { Component, OnInit } from '@angular/core';
import { ApiService } from '../api.service';

@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.css']
})
export class ListComponent implements OnInit {

  vehicules:any[]=[];

  constructor(private api:ApiService) { }

  ngOnInit(): void {
    this.initData();
  }

  initData(){
    this.api.getVehiculesList().toPromise().then((res:any[])=>{
      console.log(res);
      
      this.vehicules = res;
    })
  }

}
