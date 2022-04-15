import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class ApiService {

  constructor(private http:HttpClient) { }


  getVehiculesList(){ 
    return this.http.get(environment.api+'/vehicules/list');
  }

  findVehiculeById(id:any){ 
    return this.http.get(environment.api+'/vehicules/find/'+id);
  }

  addVehicule(data){ 
    return this.http.post(environment.api+'/vehicules/add',data);
  }


  getClientsList(){
    return this.http.get(environment.api+'/clients/list');
  }


  getCategoriesList(){
    return this.http.get(environment.api+'/categories/list');
  }


  addIntervention(data){ 
    return this.http.post(environment.api+'/interventions/add',data);
  }

}
