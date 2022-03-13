import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-home-page',
  templateUrl: './home-page.component.html',
  styleUrls: ['./home-page.component.css']
})
export class HomePageComponent implements OnInit {


  articles:any[] = [
    { title:"expmlt title 1", description:"descrption artcile 1" , photoURL:'https://ichef.bbci.co.uk/news/820/cpsprodpb/C5AF/production/_123670605_microsoftteams-image-1.png' },
    
    { title:"expmlt title 2", description:"descrption artcile 2" , photoURL:'https://ichef.bbci.co.uk/news/820/cpsprodpb/C5AF/production/_123670605_microsoftteams-image-1.png' },
    
  ]


  
  constructor() { }

  ngOnInit(): void {
  }

}
