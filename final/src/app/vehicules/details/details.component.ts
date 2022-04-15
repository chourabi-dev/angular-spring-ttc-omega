import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { ApiService } from '../api.service';

@Component({
  selector: 'app-details',
  templateUrl: './details.component.html',
  styleUrls: ['./details.component.css']
})
export class DetailsComponent implements OnInit {

  id:any;
  data:any = null;

  constructor(private route:ActivatedRoute,private api:ApiService) { }

  ngOnInit(): void {
    this.id = this.route.snapshot.params.id;

    this.getData();
  }


  getData(){
    this.api.findVehiculeById(this.id).toPromise().then((res)=>{
      console.log(res);

      this.data = res;
      
    })
  }

}
