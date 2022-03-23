import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { NewTypesComponent } from './new-types.component';

describe('NewTypesComponent', () => {
  let component: NewTypesComponent;
  let fixture: ComponentFixture<NewTypesComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ NewTypesComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(NewTypesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
