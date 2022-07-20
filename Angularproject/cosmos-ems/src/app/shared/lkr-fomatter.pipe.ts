import { Pipe, PipeTransform } from '@angular/core';
import { subscriptionLogsToBeFn } from 'rxjs/internal/testing/TestScheduler';

@Pipe({
  name: 'lkrFomatter'
})
export class LkrFomatterPipe implements PipeTransform {

  // transform(value: unknown, ...args: unknown[]): unknown {
  //   return null;
  // }
  transform(value: any, symbol: string): string {
    return (value.substr(0, 3)==='LKR'?value.replace('LKR', symbol):value)
  }

}
