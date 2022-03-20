import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-user-parameters-page',
  templateUrl: './user-parameters-page.component.html',
  styleUrls: ['./user-parameters-page.component.css']
})
export class UserParametersPageComponent implements OnInit {

  constructor(private route:ActivatedRoute) { }

  ngOnInit(): void {
    console.log(this.route.snapshot.params);
    
  }

}
