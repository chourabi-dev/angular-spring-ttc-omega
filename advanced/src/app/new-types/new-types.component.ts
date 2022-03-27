import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-new-types',
  templateUrl: './new-types.component.html',
  styleUrls: ['./new-types.component.css']
})
export class NewTypesComponent implements OnInit {



  constructor() { }

  ngOnInit(): void {
   
    /*if (navigator.geolocation != null) {
      this.geolocalisationWatch().subscribe((data)=>{
        console.log(data);
        
       },
       (error)=>{
        console.log(error); 
       }
       )
    }*/


    // HTTP GET POST PUT
    this.geolocalisationWatch().toPromise().then().catch(); 

  }



  geolocalisationWatch(){

    let observable = new Observable((observer)=>{


      navigator.geolocation.watchPosition( (p)=>{

        observer.next(p);

      },(error)=>{
        observer.error(error);
      } )
    });


    return observable;
  }



  

}





/**
 * 
 * FIRST EXPMLE
 *  this.getCameraInstanse()    .then( (retour)=>{

      console.log(retour);
      
    }  ).catch(
      (e)=>{
        console.log(e);
        
      }
    );



    
  getCameraInstanse(){
    let promsie = new Promise(( success,error )=>{
      
      // STATUS OK
     setTimeout(()=>{
        success( { success:true, camera: { mp:20 } } );

       // error( { success:false, message:'Something went wrong while getting the camera' } );
     },3000);
      
    });

    return promsie;
  }

  /************************************************************************************************************* */
  /*

  EXMPL TWO

  this.gotToStationOne(this.i).then((dataOne)=>{
    this.gotToStationTow(dataOne).then((dataTwo)=>{
      this.gotToStationThree(dataTwo).then((dataThree)=>{

        console.log(dataThree);
        
      }).catch()
    }).catch((e)=>{
      console.log(e)
    })
   }).catch();
 * 
 * 
 * 
 * ---------------
  gotToStationOne( i ){
    let promsie = new Promise( ( ok,error )=>{
      setTimeout(() => {
        i = i +1;
        ok(i);
      }, 2000);
    })
    return promsie;
  }

  gotToStationTow( i ){
    let promsie = new Promise( ( ok,error )=>{

      setTimeout(() => {
        i = i +1;

        error( 'oups' );
      }, 3000);

    })

    return promsie;
  }

  
  gotToStationThree( i ){
    let promsie = new Promise( ( ok,error )=>{

      setTimeout(() => {
        i = i +1;

        ok(i);
      }, 5000);

    })

    return promsie;
  }


  ---------------------------------------------------------------------------------
  
  async callTheBrowser(){
    let window = await this.openBrowser();

    console.log(window);
    
  }

  openBrowser(){
    let promise = new Promise((ok,error)=>{
      setTimeout(() => {
        ok( window );
      }, 2000);
    })

    return promise;
  }





 */