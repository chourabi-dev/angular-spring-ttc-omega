import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { UserParametersPageComponent } from './user-parameters-page.component';

describe('UserParametersPageComponent', () => {
  let component: UserParametersPageComponent;
  let fixture: ComponentFixture<UserParametersPageComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ UserParametersPageComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(UserParametersPageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
