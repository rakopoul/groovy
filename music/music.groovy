import groovy.json.JsonSlurper

String filePath = "/home/vagrant/groovy/music/music.json"


def jsonSlurper = new JsonSlurper()
ArrayList data = jsonSlurper.parse(new File(filePath))

println (data.getClass())

for (artist: data)
{
    println(artist.name);
    for (album: artist.albums) {
        println('\t' + album.title);
    }
}
