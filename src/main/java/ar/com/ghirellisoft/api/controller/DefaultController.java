package ar.com.ghirellisoft.api.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.awt.print.Book;
import java.util.Collection;

@RestController
public class DefaultController {

    @GetMapping("/")
    public ModelAndView swaggerUi() {
        return  new ModelAndView("redirect:swagger-ui.html");
    }


    @Operation(summary = "Get a book by its id")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Found the book",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = Book.class))}),
            @ApiResponse(responseCode = "400", description = "Invalid id supplied",
                    content = @Content),
            @ApiResponse(responseCode = "404", description = "Book not found",
                    content = @Content)})

    @GetMapping("/v1/book/{id}")
    public Book findById(@PathVariable long id) {
        return null;
    }

    @GetMapping("/v1/book/")
    public Collection<Book> findBooks() {
        return null;
    }

    @PutMapping("/v1/book/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Book updateBook(
            @PathVariable("id") final String id, @RequestBody final String book) {
        return null;
    }
}

