import { Component, ElementRef, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Employee } from './models/Employee';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  
  /*username:string="chourbai";
  email="tchourabi@gmail.com";
  year:number = 2022;
  phone;

  theDoorClosed:boolean = true;

  // { firstname lastname }
  //employees:string[] = ["employee 1","employee 2","employee 3","employee 4","employee 4"]

  employees:{firstname,lastname}[] = [ 
    { firstname:'chourabi', lastname:'taher' },
    { firstname:"test", lastname:"employee" }
  ]

  employees:Employee[] = [
    new Employee('chourabi','taher')
  ]*/

/******************************************************************************* */


toggleBlocks:boolean = true;

content = `<div >
<h1>title</h1>
<p>
  Lorem ipsum dolor sit amet consectetur adipisicing elit. Beatae corporis, inventore totam qui eius dignissimos maiores atque repellat, eaque illum nobis tempore voluptates reiciendis quo deserunt ipsam reprehenderit pariatur molestiae.
</p>
<p>
  Lorem ipsum dolor sit amet consectetur adipisicing elit. Beatae corporis, inventore totam qui eius dignissimos maiores atque repellat, eaque illum nobis tempore voluptates reiciendis quo deserunt ipsam reprehenderit pariatur molestiae.
</p>
</div>`;

//  photoURL:string="https://www.easytutoriel.com/wp-content/uploads/2021/09/fond-d-ecran-anime-windows-11-10-tutoriel-facile.jpg";


employees:any[] = [
  { name:"chourabi taher", year:2005 },
  { name:"chourabi taher", year:2006 },
  { name:"chourabi taher", year:2011 },
  { name:"chourabi taher", year:2020 },
  
]


/************************************************** */

/*
today:Date = new Date();


emailAddress = 'test@yahoo.fr';

test(){
  return("hello");
}


formatDate(date:Date){
  return date.getFullYear() +'/'+(date.getMonth()+1)+'/'+date.getDate()
}*/




/************************events *******************************************/

/*
nbrLikes:number = 12;
didLike : boolean = false;



likeClick(){
 

  if (this.didLike == false) {
    this.nbrLikes++;
  }else{
    this.nbrLikes--;
  }
  

  this.didLike = ! this.didLike;
}
*/



/******** editor ********** */

/*
fontSize:string = '12px';
fontWeight: string = 'normal';
darkMode:boolean = false;


switchToODarkMode(){
  this.darkMode = ! this.darkMode;
}


sizeChanged(event){
  const val = event.target.value;

  console.log(val);

  

  if (val != '') {
    this.fontSize = val+'px';
  }else{
    this.fontSize = '12px';
  }
  
  
}



fontWeighChanged(event){
  const val = event.target.value;

  if (val == "1") {
    this.fontWeight = 'normal'
  }else{
    this.fontWeight='bold'
  }
}


x:string='0px';
y:string='0px';


mouseIsMovin(event){
  console.log(event);

  const x = event.clientX;
  const y = event.clientY;
  
  this.x=x+'px';
  this.y = y+'px';
  
}
*/



/******************************************froms************************************ */



/**
 * form = new FormGroup({
  username : new FormControl('',[Validators.required,Validators.minLength(8)]),
  password : new FormControl('',Validators.required),
  email : new FormControl('',[Validators.required, Validators.email]),
  
  
})


submitForm(){
  console.log("submited...");

  // get the data from the form

  const val = this.form.value;

  console.log(val);
}


  constructor(){}


  ngOnInit(): void {
    console.log(this.form);
    
  }
 */



  steps:number = 1;

  form = new FormGroup({ 

    basicInfo : new FormGroup({
      fullname : new FormControl('',Validators.required),
      email : new FormControl('',Validators.required),
      phone : new FormControl('',Validators.required),
  
    }), 
    address :  new FormGroup({
      city : new FormControl('',Validators.required),
      state : new FormControl('',Validators.required),
      zipcode : new FormControl('',Validators.required), 
        
    })
    
    
  })



  articles:any[] = [
    { title:"expmlt title 1", description:"descrption artcile 1" , photoURL:'https://ichef.bbci.co.uk/news/820/cpsprodpb/C5AF/production/_123670605_microsoftteams-image-1.png' },
    { title:"expmlt title 2", description:"descrption artcile 2" , photoURL:'https://ichef.bbci.co.uk/news/820/cpsprodpb/C5AF/production/_123670605_microsoftteams-image-1.png' },
    
  ]



  constructor(){}


  ngOnInit(): void {
     console.log(this.form);
    
    
  }


  nextgroupForm(){
    this.steps++;
  }


  saveUser(){
    const val = this.form.value;

    console.log(val);
    
  }
}
