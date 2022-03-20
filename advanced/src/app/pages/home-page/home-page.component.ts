import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-home-page',
  templateUrl: './home-page.component.html',
  styleUrls: ['./home-page.component.css']
})
export class HomePageComponent implements OnInit {

  users:any[] = [
    { id:5 , name:'chourabi taher' },
    { id:6 , name:'test taher' },
    { id:7 , name:'omar taher' },
    { id:8 , name:'hichem taher' },
    
  ]
  constructor(private router:Router) { }

  ngOnInit(): void {
  }


  checkUserDetails( user ){ 
    this.router.navigate(['/user/details/params', user ]);
    
  }
}
