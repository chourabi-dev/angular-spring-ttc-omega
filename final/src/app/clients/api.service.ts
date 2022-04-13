import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class ApiService {

  constructor(private http:HttpClient) { } 
  getClientsList(){
    return this.http.get(environment.api+'/clients/list');
  }


  findClientByID(id){
    return this.http.get(environment.api+'/clients/find/'+id);
  }

  deleteClientByID(id){
    return this.http.delete(environment.api+'/clients/delete/'+id);
  }


  addNewClient(data){
    return this.http.post(environment.api+'/clients/add',data)
  }

  updateClient(data,id){
    return this.http.put(environment.api+'/clients/update/'+id,data)
  }

}
