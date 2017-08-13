package groovy.samples.coerciveclosures
def strings= "this is a string"
List splits = strings.split(' ')
println( splits.class.name)
Collections.sort(splits, new Comparator<String>() {
int compare(String s1,String s2) {
s1.size()<=>s2.size()
}
})

println(splits)

splits = strings.split(' ')
Collections.sort(splits,{s1,s2-> s1.size()<=>s2.size()})
println(splits)

splits = strings.split(' ')
splits.sort{s1,s2->s1.size() <=>s2.size()}
println(splits)

splits = strings.split(' ')
splits.sort({-it.size()})
println(splits)