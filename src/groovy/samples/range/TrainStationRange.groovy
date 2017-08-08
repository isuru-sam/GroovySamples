package groovy.samples.range

TrainStation t1 = new TrainStation("Colombo","Fort",0)

t1.previous=null
TrainStation t2 = new TrainStation("Colombo","Maradana",2)
t1.next=t2

t2.previous=t1


TrainStation t3 = new TrainStation("Colombo","Demataoda",4)
t2.next=t3

t3.previous=t2



TrainStation t4 = new TrainStation("Colombo","Kelaniya",6)
t3.next=t4

t4.previous=t3


TrainStation t5 = new TrainStation("Colombo","Wanawasala",8)
t4.next=t5

t5.previous=t4


TrainStation t6 = new TrainStation("Colombo","Hunupitiya",10)
t5.next=t6
t6.next=null
t6.previous=t5

(t1..t4).each({println it.toString()})

println "=============="

(t4..t1).each({println it.toString()})


