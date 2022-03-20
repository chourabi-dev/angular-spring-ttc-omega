import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-user-page',
  templateUrl: './user-page.component.html',
  styleUrls: ['./user-page.component.css']
})
export class UserPageComponent implements OnInit {

  id:any;

  // inject service ?
  constructor(private route:ActivatedRoute) { }

  ngOnInit(): void {
   this.id  = this.route.snapshot.params.id;
    
  }


  getUserData(){
    // call backend ID
  }

}
