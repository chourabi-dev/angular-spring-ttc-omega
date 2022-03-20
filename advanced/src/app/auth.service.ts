import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  isConnected:boolean = false;

  constructor() { }


  connect(){
    this.isConnected = true;
  }
}
