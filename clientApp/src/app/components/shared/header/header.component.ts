import { Component, OnInit } from '@angular/core';
import { ServiceTask } from 'src/app/services/task.service';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css'],
})
export class HeaderComponent implements OnInit {
  constructor(private _ServicesTask: ServiceTask) {}

  ngOnInit(): void {}

  datosMenu = {
    titulo: 'google',
    icon: 'fa fa-home',
    url: 'https://www.google.com/',
  };

  findTask() {
    this._ServicesTask.listTask('/task-ms/task').subscribe(res =>{
      console.log(res);
    })
    
  }
}
