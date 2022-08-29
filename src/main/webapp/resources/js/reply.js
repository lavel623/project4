console.log("Reply Module.........");

let replyService = (function() {
	
	function add(reply, callback, error){
		console.log("reply............");
		
		$.ajax({
			type : 'post',
			url : '/replies/new',
			data : JSON.stringify(reply),
			contentType : "application/json; charset=utf-8",
			success : function(result, status, xhr) {
				if(callback) {
					callback(result);
				}
			},
			error : function(xhr, status, er) {
				if (error) {
					error(er);
				}
			}
		})
	}
	
	function getList(param, callback, error) {
		
		let bno = param.bno;
		
		let page = param.page || 1;
		$.getJSON("/replies/pages/" + bno + "/" + page + ".json",
			function(data) {
				if(callback) {
					callback(data);
				}
			}).fail(function(xhr, status, err) {
				if(error) {
					error();
				}
			})
	}
	
	function remove(rno, callback, error) {
		$.ajax( {
			type : 'delete',
			url : '/replies/' + rno, 
			success : function(deleteResult, status, xhr) {
				if (callback) {
					callback(deleteResult);
				}
			},
			error : function(xhr, status, er) {
				if (error) {
					error(er);
				}
			}
		});
	}
	
	return {
		add:add,
		getList : getList,
		remove : remove
		};
})();