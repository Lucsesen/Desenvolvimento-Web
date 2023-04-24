package br.iff.edu.exception;

        import br.iff.edu.exception.ExceptionInfo;
        import org.springframework.data.crossstore.ChangeSetPersister;
        import org.springframework.http.HttpStatus;
        import org.springframework.http.ResponseEntity;
        import org.springframework.web.bind.annotation.ControllerAdvice;
        import org.springframework.web.bind.annotation.ExceptionHandler;
        import org.springframework.web.client.HttpClientErrorException;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ChangeSetPersister.NotFoundException.class)
    public ResponseEntity<ExceptionInfo> NotFoundException(ChangeSetPersister.NotFoundException e){
        String dica = "Não foi possível possível encontrar o objeto solicitado. Por favor, volte à página anterior.";
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
                new ExceptionInfo(HttpStatus.NOT_FOUND, e.getMessage(), dica)
        );
    }

    @ExceptionHandler(HttpClientErrorException.BadRequest.class)
    public ResponseEntity<ExceptionInfo> BadRequestException(HttpClientErrorException.BadRequest e) {
        String dica = "Não foi possível realizar a operação desejada, tente novamente realizando as correções de acordo com o erro à esquerda. Por favor, volte à página anterior.";
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(
                new ExceptionInfo(HttpStatus.BAD_REQUEST, e.getMessage(), dica)
        );
    }


    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<ExceptionInfo> IllegalArgumentException(IllegalArgumentException e){
        String dica = "Não foi possível realizar a operação desejada, tente novamente realizando as correções de acordo com o erro à esquerda. Por favor, volte à página anterior.";
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(
                new ExceptionInfo(HttpStatus.BAD_REQUEST, e.getMessage(), dica)
        );
    }

    @ExceptionHandler({Exception.class, RuntimeException.class})
    public ResponseEntity<ExceptionInfo> handleInternalServerError(Exception e) {
        String dica = "Não foi possível realizar a operação desejada, verifique os dados digitados. Por favor, volte a pagina anterior.";
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(
                new ExceptionInfo(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage(), dica)

        );
    }


}