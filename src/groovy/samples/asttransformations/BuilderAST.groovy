package groovy.samples.asttransformations

import groovy.transform.builder.Builder

@Builder
class Message {
    String from, to, subject, body
}

def message = Message
        .builder()  // New internal helper class.
        .from('mrhaki@mrhaki.com')  // Method per property.
        .to('mail@host.nl')
        .subject('Sample mail')
        .body('Groovy rocks!')
        .build()  // Create instance of Message