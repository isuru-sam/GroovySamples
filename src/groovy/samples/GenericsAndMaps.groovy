List myList =[2,3,4,5]
println myList
List myList2 =[2,3,4,5,'bob', new Date()]
println myList2
List<Integer> myList3=[2,3,4,5,'bob', new Date()]
println myList3
myList3.each{num -> println num.class.name}
println myList2.class.name

def nums=[2,3,4,5,7]
nums<< 8
nums<<[10,11]<<[13,14]
nums+=99
nums-=4
nums[0]=100
nums=nums.flatten()
println nums


def mynums=[2,8,10,20,1,3,9,40]

def slicedmynums1=mynums[1..4]
def slicedmynums2=mynums[2..<-1]
println slicedmynums1
println slicedmynums2

def filternums =mynums.findAll{it>10}
println filternums
def multi=filternums.collect{it*2}
println multi




def map = [a:1,b:2,c:3]
map.d=5;
map['e']=6;
map.put('f',7)
map<< [price:150]
map+=[name:'john']
println map
println map.d
println map.keySet()
//println map.class.name
println map.getClass().name
map.each{key,value->println(key+"-"+value)}


