## Info & Docs

##Notes
- Identify the base case
- Identify the recursive case
- Get closer and closer and return when needed. Usually we will have 2 returns
   - One return at base case or base condition
   - One return at calling the recursive function. If we dont have this return, then value will not be returned to the first called
   
   
```js
let counter=0;
function inception() {
  console.log(counter);
  if(counter > 3) {
    return "done!";  // one return here
  }
  counter++;
  return inception() // 2nd return here
}

inception();
```

- Everything which can be done with recursion  can also be achieved with iterative approach

#### Recursion Rule
![Recursion Rule.png](./Images/Recursion Rule.png)
