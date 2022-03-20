import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class CartService {

  private productCart:any[] = [];

  constructor() { }


  addNewProduct(p){
    this.productCart.push(p)
  }

  getShoppingList(){
    return this.productCart;
  }
}
