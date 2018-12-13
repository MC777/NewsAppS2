package com.example.mck.newsapps1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class NewsAdapter extends ArrayAdapter<News> {

    /**
     * Constructs a new {@link NewsAdapter}.
     *
     * @param context of the app
     * @param newses  is the list of news, which is the data source of the adapter
     */
    public NewsAdapter(Context context, List<News> newses) {
        super(context, 0, newses);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.news_list_item, parent, false);
        }

        News currentNews = getItem(position);
        TextView sectionView = (TextView) listItemView.findViewById(R.id.web_title);
        sectionView.setText(currentNews.getmWebTitle());

        TextView sectionName = (TextView) listItemView.findViewById(R.id.section_name);
        sectionName.setText(currentNews.getSectionName());

        TextView sectionDate = (TextView) listItemView.findViewById(R.id.date);
        sectionDate.setText(currentNews.getWebPublicationDate());

        TextView sectionAuthor = (TextView) listItemView.findViewById(R.id.author);
        sectionAuthor.setText(currentNews.getAuthor());

        SimpleDateFormat dateFormatJSON = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.ENGLISH);
        SimpleDateFormat dateFormatNew = new SimpleDateFormat("dd MMM yyyy", Locale.ENGLISH);
        Date dateNews = null;
        try {
            dateNews = dateFormatJSON.parse(currentNews.getWebPublicationDate());
            String date = dateFormatNew.format(dateNews);
            sectionDate.setText(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return listItemView;
    }
}
