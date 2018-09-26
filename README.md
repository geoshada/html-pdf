# HTML-PDF
Es repositorio contiene una utileria en java que permite generar un pdf a partir de una cadena de html.

Para poder generar un pdf solo hace falta llamar el metódo "HtmlToPdf" de la clase "PdfUtileria", donde el metódo recibe dos parámetros de tipo String. Veamos el siguiente ejemplo:

```Java
HtmlToPdf("hola.pdf", "<!DOCTYPE html>\n"
                + "<html>\n"
                + "<head>\n"
                + "<style>\n"
                + "body {\n"
                + "    background-color: linen;\n"
                + "}\n"
                + "h1 {\n"
                + "    color: maroon;\n"
                + "    margin-left: 40px;\n"
                + "} \n"
                + "</style>\n"
                + "</head>\n"
                + "<body>\n"
                + "\n"
                + "<h1>Soy Geobyte</h1>\n"
                + "<p>He creado un pdf.</p>\n"
                + "\n"
                + "</body>\n"
                + "</html>");
```

Donde podemos ver que el primer parametro es el nombre del archivo a generar y la segunda es el html que se quiere convertir a PDF.

Cualquier duda o comentario no duden en contactarme.

Saludos!
