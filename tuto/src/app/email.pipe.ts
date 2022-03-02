import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'email'
})
export class EmailPipe implements PipeTransform {

  transform(value: string, ...args: any[]): unknown {

    //tchourabi@gmail.com

    const partOne = value[0];
    const partTwo = value.split('@')[1];


    return partOne+'************@'+partTwo;
  }

}
