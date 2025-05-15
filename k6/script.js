import http from 'k6/http';
import { check } from 'k6';
import { Trend } from 'k6/metrics';

let responseTime = new Trend('http_req_duration');

export let options = {
  vus: 10,
  duration: '30s',
};

export default function () {
  let res = http.get('https://test.k6.io');
  responseTime.add(res.timings.duration);
  check(res, {
    'status is 200': (r) => r.status === 200,
  });
}
