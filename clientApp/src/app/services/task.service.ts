import { Injectable } from '@angular/core';
import { Observable, takeLast } from 'rxjs';
import { HttpClient } from '@angular/common/http';


@Injectable({
  providedIn: 'root'
})
export class ServiceTask {
  private appUrl = "localhost:8080"
  constructor(private http: HttpClient) { }

    public listTask(url:string): Observable<any> {
      return this.http.get<any>( `${this.appUrl + url}`)
    }

}
