$(document).ready(function() {
    $('#uploadForm').submit(function(event) {
        event.preventDefault(); // Предотвращаем отправку формы по умолчанию

        var formData = new FormData(this);

        $.ajax({
            url: '/upload',
            type: 'POST',
            data: formData,
            processData: false,
            contentType: false,
            success: function(response) {
                if (response.success) {
                    location.reload(); // Обновляем страницу после успешной загрузки
                } else {
                    console.error(response.message);
                }
            },
            error: function(xhr, status, error) {
                console.error('Error:', error);
            }
        });
    });
});