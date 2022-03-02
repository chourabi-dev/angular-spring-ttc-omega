import { Component } from '@angular/core';
import { Employee } from './models/Employee';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  
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


today:Date = new Date();


emailAddress = 'test@yahoo.fr';

test(){
  return("hello");
}


formatDate(date:Date){
  return date.getFullYear() +'/'+(date.getMonth()+1)+'/'+date.getDate()
}

}
