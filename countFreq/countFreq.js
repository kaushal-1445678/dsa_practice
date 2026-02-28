
const freq=(a)=>{
    let map=new Map();
    for(let val of a){
        map.set(val,(map.get(val)||0)+1);
    }
    for(const[key,value] of map.entries()){
        console.log(`${key} = ${value}`);
    }

}

const a = [10, 15, 15, 10, 20, 20, 20, 20, 10, 10, 20];
freq(a);
