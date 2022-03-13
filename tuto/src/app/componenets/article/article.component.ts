import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-article',
  templateUrl: './article.component.html',
  styleUrls: ['./article.component.css']
})
export class ArticleComponent implements OnInit {

   // [description]="a.description" [title]="a.title" [photoURL]="a.photoURL"

   @Input() description:string;
   @Input() title:string;
   @Input() photoURL:string;
  


  constructor() { }

  ngOnInit(): void {
  }

}
