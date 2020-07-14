var index = {
    init: function () {
        var _this = this;
        $('#btn-save').on('click', function () {
            _this.save();
        });
    },
    save: function () {
        var data = {
            name: $('#name').val(),
            author: $('#author').val(),
            translator: $('#translator').val(),
            publisher: $('#publisher').val(),
            publishedDate: $('#publishedDate').val()
        };

        $.ajax({
            type: 'POST',
            url: '/admin/api/v1/books',
            dataType: 'json',
            contentType:'application/json; charset=utf-8',
            data: JSON.stringify(data)
        }).done(function () {
            alert('책이 등록되었습니다.');
            window.location.href='/admin/list';
        }).fail(function (err) {
            alert(JSON.stringify(err));
        });

    }
};

index.init();