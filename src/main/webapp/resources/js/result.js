$(document).ready(function() {
	$('#moreButton').click(function(event) {
		event.preventDefault();
		var book = new Object();
		book.name="Mossad";
		book.pages=230;
		console.log("input := "+book);
		$.ajax({
		    headers: { 
		        "Accept" : "application/json; charset=utf-8",
		        "Content-Type": "application/json; charset=utf-8"
		    },
		    data: JSON.stringify(book),
		    type: 'POST',
		    dataType: "json",
		    url: "/examples/more",
		    success : function(response) {
		    	
		    	console.log("res sssss : "+ response);
		    	
		    	$.get('/examples/resources/templates/book-template.html',{ "_": $.now() },function(templates) {
		    		console.log("templates := " + templates);
		    	    var template = $(templates).filter('#bookTemplate').html();
		    	    console.log("template := " + template);
		    	    //console.log("respones is :="+response);
		    	    console.log("Output : = "+ Mustache.render(template, response));
		    	   // $('#additionalBooks').html(Mustache.render(template, response));
		    	    
		    	    $('body').append(Mustache.render(template, response));
		    	   // $('#additionalBooks').html(info);
		    	});
		    }
		})
	});
});

$.ajaxSetup({
    // Disable caching of AJAX responses
    cache: false
});
